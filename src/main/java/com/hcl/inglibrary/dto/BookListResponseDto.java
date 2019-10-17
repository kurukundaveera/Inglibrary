package com.hcl.inglibrary.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookListResponseDto {

	private Integer bookId;
	private String bookName;
	private String authorName;
	private String status;
}
