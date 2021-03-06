package com.rm.app.refrigerator_management_app.web.dto;

import com.rm.app.refrigerator_management_app.domain.memo.Memo;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MemoListResponseDto {
    private Long id;
    private String content;
    private boolean complete;

    public MemoListResponseDto(Memo entity) {
        this.id = entity.getId();
        this.content = entity.getContent();
        this.complete = entity.getComplete();
    }
}
