package com.bsc.modules.topic.entity;
import com.bsc.common.persistence.BaseEntity;
import com.bsc.modules.section.entity.Section;
import com.bsc.modules.post.entity.Post;
/**
 * @author YangRui
 */
public class Topic extends BaseEntity{
    private Section section;
    private Integer moID;//模块id
    private Post post;
   private  Integer postID; //帖子id
    private String topic;		 // 话题
    private Integer num;	    // 帖子数量


    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Integer getMoID() {
        return moID;
    }

    public void setMoID(Integer moID) {
        this.moID = moID;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

   public Integer getPostID() {
        return postID;
    }

    public void setPostID(Integer postID) {
        this.postID = postID;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
