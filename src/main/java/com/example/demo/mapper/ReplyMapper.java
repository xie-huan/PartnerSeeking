package com.example.demo.mapper;

import com.example.demo.entity.Post;
import com.example.demo.entity.Reply;
import com.example.demo.entity.ReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplyMapper {
    int countByExample(ReplyExample example);

    int deleteByExample(ReplyExample example);

    int deleteByPrimaryKey(Integer rId);

    int insert(Reply record);

    int insertSelective(Reply record);

    List<Reply> selectByExample(ReplyExample example);

    Reply selectByPrimaryKey(Integer rId);

    int updateByExampleSelective(@Param("record") Reply record, @Param("example") ReplyExample example);

    int updateByExample(@Param("record") Reply record, @Param("example") ReplyExample example);

    int updateByPrimaryKeySelective(Reply record);

    int updateByPrimaryKey(Reply record);

    public boolean deleteReplyByPid(int pid);

    public int getReplyNumByPost(int pid);

    public List<Integer> findPidByUid(String uid);

    public int countByrUid(String uid , int pid);
}