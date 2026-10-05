package com.umc.study.controller;

import com.umc.study.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class RentalController {

    private final RentalService rentalService;

    // POST http://localhost:8080/rentals
    @PostMapping("/rentals")
    public String createRental(@RequestBody Map<String, Object> body) {
        rentalService.createRental(body);
        return "도서 대여가 완료되었습니다!";
    }

    // PATCH http://localhost:8080/rentals/{rentalId}/return
    @PatchMapping("/rentals/{rentalId}/return")
    public String returnRental(@PathVariable Long rentalId) {
        rentalService.returnRental(rentalId);
        return "도서 반납이 완료되었습니다!";
    }
}