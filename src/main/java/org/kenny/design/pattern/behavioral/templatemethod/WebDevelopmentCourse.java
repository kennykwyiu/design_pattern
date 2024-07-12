package org.kenny.design.pattern.behavioral.templatemethod;

public class WebDevelopmentCourse extends ACourse {
    private boolean needWriteArticleFlag = false;

    public WebDevelopmentCourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    void packageCourse() {
        System.out.println("provide the front end JS source code");
        System.out.println("provide the photo or icon in the website");
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
}
