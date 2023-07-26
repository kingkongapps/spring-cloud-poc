package com.samsungsds.ratingservice;

import lombok.Data;

@Data
public class Rating {
    private Long id;
    private Long bookId;
    private int stars;

    Rating(long id, Long bookId, int stars) {
        this.id = id;
        this.bookId = bookId;
        this.stars = stars;
    }
}
