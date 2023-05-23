package com.example.runningclub.mapper;

import com.example.runningclub.dto.ClubDto;
import com.example.runningclub.model.Club;

import static com.example.runningclub.mapper.EventMapper.mapToEventDto;

public class ClubMapper {

    public static Club mapToClub(ClubDto clubDto) {

        return Club.builder()
                .id(clubDto.getId())
                .title(clubDto.getTitle())
                .photoUrl(clubDto.getPhotoUrl())
                .content(clubDto.getContent())
                .createdOn(clubDto.getCreatedOn())
                .updateOn(clubDto.getUpdateOn())
                .build();
    }

    public static ClubDto mapToClubDto(Club club) {

        return ClubDto.builder()
                .id(club.getId())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .content(club.getContent())
                .createdOn(club.getCreatedOn())
                .updateOn(club.getUpdateOn())
                .events(club.getEvents().stream().map((event) -> mapToEventDto(event)).toList())
                .build();
    }
}
