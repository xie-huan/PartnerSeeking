package com.example.demo.controller;

import com.example.demo.FileUpload;
import com.example.demo.entity.Post;
import com.example.demo.sevice.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    public PostService postService;

    @RequestMapping("/addPost")
    public boolean addPsot(String pTittle, String pContent, String pUid, String pKeyword, MultipartFile Picfile, Date pEndtime,
                            Integer pCollectnum, Byte pBan, Byte pPro, Byte pExi)
    {
        String pPic = "null";
        if(Picfile !=null) {
           pPic = FileUpload.writeUploadFile(Picfile, "Picture"); // 存入本地 返回hash名
        }

        return postService.addPsot(new Post(pTittle,pContent, pUid, pKeyword,  pPic,pEndtime,
                                             pCollectnum, pBan, pPro, pExi));
    }

    @RequestMapping("/findPostByUID/{uid}")
    public List<Post> findPostByUID(@PathVariable("uid") String uid)
    {
        return postService.findPostByUID(uid);
    }

    @RequestMapping("/findPostByPostTimeAsc")
    public List<Post> findPostByPostTimeAsc()
    {
        return postService.findPostByPostTimeAsc();
    }
    @RequestMapping("/findPostByPostTimeDesc")
    public List<Post> findPostByPostTimeDesc()
    {
        return postService.findPostByPostTimeDesc();
    }
    @RequestMapping("/findPostByEndTimeAsc")
    public List<Post> findPostByEndTimeAsc()
    {
        return postService.findPostByEndTimeAsc();
    }
    @RequestMapping("/findPostByEndTimeDesc")
    public List<Post> findPostByEndTimeDesc()
    {
        return postService.findPostByEndTimeDesc();
    }

    @RequestMapping("/findPostByKeyword")
    public List<Post> findPostByKeyword(String keyword)
    {
        System.out.println("findPostByKeyword::keyword = "+keyword);
        return postService.findPostByKeyword(keyword);
    }

    @RequestMapping("/deletePostByPID")
    public int deletePostByPID(int pid)
    {
        return postService.deleteByPid(pid);
    }
}
