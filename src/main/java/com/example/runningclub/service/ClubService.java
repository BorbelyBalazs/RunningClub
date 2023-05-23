package com.example.runningclub.service;

import com.example.runningclub.dto.ClubDto;
import com.example.runningclub.model.Club;

import java.util.List;

public interface ClubService {

    List<ClubDto> findAllClubs();
    Club saveClub(ClubDto clubDto);

    ClubDto findClubById(long clubId);

    void updateClub(ClubDto club);

    void delete(Long clubId);

    List<ClubDto> searchClubs(String query);
}
