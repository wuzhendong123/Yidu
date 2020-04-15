package org.yidu.novel.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class TChapterExt implements Serializable {
    // fields
    private java.lang.Integer articleno;
    private java.lang.Integer chapterno;
    private java.lang.String articlename;
    private java.lang.String chaptername;
    private java.lang.String type;
    private java.lang.String content;

}
