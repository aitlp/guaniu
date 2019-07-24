package com.aitlp.author.data;

import lombok.Data;

@Data
public class AuthorDTO {
    private String desc;
    private String name;

    public Author changeToAuthor() {
        Author author = new Author();
        author.setAuthorName(name);
        author.setAuthorDesc(desc);
        return author;
    }
}
