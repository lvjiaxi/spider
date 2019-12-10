package com.anqun.service;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Service
public class AdManageService {
    //初始化一次
    private static  Integer count=1;
    public String adManage(HttpServletResponse httpServletResponse, HttpServletRequest httpServletRequest,String ad,String arg){

        try {
            String header = httpServletRequest.getHeader("User-Agent");

            //这个方法是判断搜索蜘蛛
            if ((header.contains("baidu")&&header.contains("spider"))||
                    (header.contains("Baiduspider"))||(header.contains("Googlebot")&&header.contains("google"))
                    ||(header.contains("YisouSpider"))||(header.contains("Sogou")&&header.contains("spider"))
                    ||(header.contains("Bingbot")) ||(header.contains("Yisou"))||(header.contains("360Spider"))
                    ||(header.contains("Yisouspider"))
            ){
//            System.out.println("百度搜索");
                return "";
            }

            //下面是用户第一次访问不弹出广告
            HttpSession session = httpServletRequest.getSession();
            //获取session值
//        String id = session.getId();
            //用户进来第一次先判断是否在session中是有计数参数,如果没有就创建记0次,如果有就会进一步添加
            if (session.getAttribute(arg)==null){
                session.setAttribute(arg,count);
            }else{
                Integer c =(Integer) session.getAttribute(arg);
                c++;
                //将计数存入session
                session.setAttribute(arg,c);
            }
            if ((Integer)session.getAttribute(arg)==1){
//            System.out.println("第一次访问不显示广告位");
            }else {
                //返回广告
                return ad;
            }

        }catch (Exception e){
            //如果系统错误直接返回gg
            return ad;
        }
        //仅限于第一次访问或者出现问题返回空字符
        return "";
    }
}
