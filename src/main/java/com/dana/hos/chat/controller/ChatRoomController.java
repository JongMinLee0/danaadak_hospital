package com.dana.hos.chat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dana.hos.chat.module.ChatRoom;
import com.dana.hos.chat.repo.ChatRoomRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping("/chat")
public class ChatRoomController {

	@Autowired
	private final ChatRoomRepository chatRoomRepository;

	// 채팅 리스트 화면
	// 바로 리스트를 뿌려주도록 변경
	@GetMapping("/room")
	public ModelAndView rooms(ModelAndView model) {
		model.addObject("aList", chatRoomRepository.findAllRoom());
		model.setViewName("chat/room");
		return model;
	}

	// 모든 채팅방 목록 반환
	@GetMapping("/rooms")
	@ResponseBody
	public List<ChatRoom> room() {
		return chatRoomRepository.findAllRoom();
	}

	// 채팅방 생성
	@PostMapping("/room")
	@ResponseBody
	public ChatRoom createRoom(@RequestParam String name1, @RequestParam String name2) {
		boolean exist = chatRoomRepository.existRoom(name1, name2);
		
		// 이미 존재하는 경우라면
		if(exist) {
			return new ChatRoom().existCreate();
		}
		return chatRoomRepository.createChatRoom(name1, name2);
	}

	// 채팅방 입장 화면
	@GetMapping("/room/enter/{roomId}")
	public String roomDetail(Model model, @PathVariable String roomId) {
		model.addAttribute("roomId", roomId);
		return "chat/roomdetail";
	}

	// 특정 채팅방 조회
	@GetMapping("/room/{roomId}")
	@ResponseBody
	public ChatRoom roomInfo(@PathVariable String roomId) {
		return chatRoomRepository.findRoomById(roomId);
	}
}
