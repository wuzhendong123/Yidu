package org.yidu.novel.service;

import org.yidu.novel.entity.TChapterExt;
import org.yidu.novel.entity.enums.ChapterExtEnum;

public interface ChapterExtService {
    TChapterExt findByChapterNo(Integer chapterNo, ChapterExtEnum chapterExtEnum);

}
