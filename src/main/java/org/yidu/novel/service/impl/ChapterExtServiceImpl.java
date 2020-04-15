package org.yidu.novel.service.impl;

import org.yidu.novel.entity.TChapter;
import org.yidu.novel.entity.TChapterExt;
import org.yidu.novel.entity.enums.ChapterExtEnum;
import org.yidu.novel.service.ChapterExtService;
import org.yidu.novel.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class ChapterExtServiceImpl extends HibernateSupportServiceImpl implements ChapterExtService {
    @Override
    public TChapterExt findByChapterNo(Integer chapterNo, ChapterExtEnum chapterExtEnum) {
        StringBuffer hql = new StringBuffer();
        List<Object> params = new ArrayList<Object>();
        hql.append("FROM TChapterExt WHERE chapterno=? and type = ? ");
        params.add(chapterNo);
        params.add(chapterExtEnum.name());
        // 只取一条记录
        List<TChapterExt> chapterList = this.findByRange(hql.toString(), 0, 1, params);
        if (Utils.isDefined(chapterList)) {
            return chapterList.get(0);
        }
        return null;
    }
}
