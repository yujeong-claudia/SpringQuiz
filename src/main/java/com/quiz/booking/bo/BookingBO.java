package com.quiz.booking.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.quiz.booking.domain.Booking;
import com.quiz.booking.mapper.BookingMapper;

@Service
public class BookingBO {
	
	@Autowired
	private BookingMapper bookingMapper;

	public List<Booking> getBookingList() {
		return bookingMapper.selectBookingList();
	}
	
	public int deleteBookingById(int id) {
		return bookingMapper.deleteBookingById(id);
	}
	
	public void addBooking(String name, String date, int day,
			int headcount, String phoneNumber) {
		
		bookingMapper.insertBooking(name, date, day, headcount, phoneNumber);
	}
	
	// 없으면 null, 있으면 객체
	public Booking getBookingByNamePhoneNumber(String name, String phoneNumber) {
		// 없는 경우: [], 있는 경우 [1, 2, 3]
		List<Booking> bookingList = bookingMapper.selectBookingListByNamePhoneNumber(name, phoneNumber);
//		if (bookingList.isEmpty()) {
//			return null;
//		}
//		return bookingList.get(bookingList.size() - 1);
		return bookingList.isEmpty() ? null : bookingList.get(bookingList.size() - 1);
	}
}