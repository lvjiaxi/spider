package com.anqun.service;

import com.alibaba.fastjson.JSON;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Spider {
        public static Logger logger= LoggerFactory.getLogger(Spider.class);
//
//    public static void main(String[] args) throws IOException {
//
//        String source = getSource("https://www.biqukan.com/");
//
//        System.out.println(""+source);
//
//        //获取列表规则
//        Pattern newUrlPattern = Pattern.compile("<span class=\"s2\"><a href=\"/\\d+_(\\d+)/\">(.+?)</a></span><span class=\"s3\">");
//        Matcher matcher = newUrlPattern.matcher(source);
//        while (matcher.find()){
//            //储存列表所获取的小说信息
//            Map<String,String> m =new HashMap<>();
//            //获取id
//            String bid = matcher.group(1);
//
//            Long b=Long.valueOf(bid);
//            //获取书名
//            String bname = matcher.group(2);
//            //获取小说信息页
//            String author=null;
//            String sort=null;
//            String intro=null;
//            String degree=null;
//            String cover=null;
//
//            String bookInfoUrl="https://www.biqukan.com/"+b/1000+"_"+bid+"/";
//            String infoHtml = getSource(bookInfoUrl);
//            //获取小说名称规则
//            Pattern infoNamePattern = Pattern.compile("<h2>(.+?)</h2>");
//            Matcher infoNamematcher = infoNamePattern.matcher(infoHtml);
//
//
//            if (infoNamematcher.find()){
//                //进一步赋值小说名称
//                bname = infoNamematcher.group(1);
//                System.out.println(bname);
//            }else {
//                System.out.println("小说名不存在");
//            }
//            Pattern infoAuthorPattern = Pattern.compile("<meta property=\"og:novel:author\" content=\"(.+?)\"/>");
//            Matcher infoAuthormatcher = infoAuthorPattern.matcher(infoHtml);
//            if (infoAuthormatcher.find()){
//                author=infoAuthormatcher.group(1);
//                System.out.println(author);
//            }else {
//                System.out.println("小说作者不存在");
//            }
//
//            Pattern infoSortPattern = Pattern.compile("<meta property=\"og:novel:category\" content=\"(.+?)\"/>");
//            Matcher infoSortmatcher = infoSortPattern.matcher(infoHtml);
//            if (infoSortmatcher.find()){
//                sort=infoSortmatcher.group(1);
//                System.out.println(sort);
//            }else {
//                System.out.println("小说分类不存在");
//            }
//
//            //([^']+?) 正则获取第一次匹配的文档 （多行模式）
//            Pattern infoIntroPattern = Pattern.compile("<meta property=\"og:description\" content=\"([^']+?)\"/>");
//            Matcher infoIntromatcher = infoIntroPattern.matcher(infoHtml);
//            if (infoIntromatcher.find()){
//                intro=infoIntromatcher.group(1);
//                System.out.println(intro);
//            }else {
//                System.out.println("小说简介不存在");
//            }
//
//            Pattern infoDegreePattern = Pattern.compile("<meta property=\"og:novel:status\" content=\"(.+?)\"/>");
//            Matcher infoDegreematcher = infoDegreePattern.matcher(infoHtml);
//            if (infoDegreematcher.find()){
//                degree=infoDegreematcher.group(1);
//                System.out.println(degree);
//            }else {
//                System.out.println("小说状态不存在");
//            }
//
//            Pattern infoCoverPattern = Pattern.compile("<meta property=\"og:image\" content=\"(.+?)\"/>");
//            Matcher infoCovermatcher = infoCoverPattern.matcher(infoHtml);
//            if (infoCovermatcher.find()){
//                cover=infoCovermatcher.group(1);
//                System.out.println(cover);
//            }else {
//                System.out.println("小说封面不存在");
//            }
//
//            //开始获取章节列表
//            String bookDirectoryUrl="https://www.biqukan.com/"+b/1000+"_"+bid+"/";
//            String directoryHtml = getSource(bookDirectoryUrl);
//
//            Pattern directoryPattern = Pattern.compile("<dd><a href =\"/\\d+_\\d+/(\\d+).html\">(.+?)</a></dd>");
//            Matcher directorymatcher = directoryPattern.matcher(directoryHtml);
//            //创建储存章节的list
//            List<Map<String,String>> directoryList=new ArrayList<>();
//            System.out.println(directorymatcher.find());
//            while (directorymatcher.find()){
//                Map<String,String> d= new HashMap<>();
//                d.put(directorymatcher.group(1),directorymatcher.group(2));
////                //获取所有的章节号
////                System.out.println(directorymatcher.group(1));
//                //获取所有的章节名
////                System.out.println(directorymatcher.group(2));
//                directoryList.add(d);
//            }
//
//            //选择处理方式
//            //去除指定前几章节和后几章节
//            int forwardNum=3;
//            int size = directoryList.size()-3;
//            List<Map<String,String>> analysisDirectoryList=new ArrayList<>();
//            for (int i = forwardNum; i <size; i++) {
//                analysisDirectoryList.add(directoryList.get(i));
//            }
//
//            //获取列表oid 和name SELECT oid,name  FROM `cnkong5`.`ptcms_novelsearch_chapter_87` where `novelid` ='6887' and oid !=0 group by `oid`
//
//
//
//
//
//            //暂时只采集列表第一本书
//            return;
//        }
//
//
//
////        //爬取指定的列表页
////        Document doc = Jsoup.connect("https://www.biqukan.com/").get();
////        //将文档转为字符串，并且获取书籍列表
////        String list=doc.toString();
////        //获取列表规则
////        Pattern newUrlPattern = Pattern.compile("<span class=\"s2\"><a href=\"/\\d+_(\\d+)/\">(.+?)</a></span><span class=\"s3\">");
////        Matcher matcher = newUrlPattern.matcher(list);
////        while (matcher.find()){
////            //储存列表所获取的小说信息
////            Map<String,String> m =new HashMap<>();
////            //获取id
////            String bid = matcher.group(1);
////
////            Long b=Long.valueOf(bid);
////            //获取书名
////            String bname = matcher.group(2);
////            //获取小说信息页
////            String author=null;
////            String sort=null;
////            String intro=null;
////            String degree=null;
////            String cover=null;
////
////            String bookInfoUrl="https://www.biqukan.com/"+b/1000+"_"+bid+"/";
////            Document infoDoc = Jsoup.connect(bookInfoUrl).get();
////            String info =infoDoc.toString();
////            //获取小说名称规则
////            Pattern infoNamePattern = Pattern.compile("<h2>(.+?)</h2>");
////            Matcher infoNamematcher = infoNamePattern.matcher(info);
////            if (infoNamematcher.find()){
////                //进一步赋值小说名称
////                bname = infoNamematcher.group(1);
////                System.out.println(bname);
////            }else {
////                System.out.println("小说名不存在");
////            }
////            Pattern infoAuthorPattern = Pattern.compile("<meta property=\"og:novel:author\" content=\"(.+?)\">");
////            Matcher infoAuthormatcher = infoAuthorPattern.matcher(info);
////            if (infoAuthormatcher.find()){
////                author=infoAuthormatcher.group(1);
////                System.out.println(author);
////            }else {
////                System.out.println("小说作者不存在");
////            }
////
////            Pattern infoSortPattern = Pattern.compile("<meta property=\"og:novel:category\" content=\"(.+?)\">");
////            Matcher infoSortmatcher = infoSortPattern.matcher(info);
////            if (infoSortmatcher.find()){
////                sort=infoSortmatcher.group(1);
////                System.out.println(sort);
////            }else {
////                System.out.println("小说分类不存在");
////            }
////
////            Pattern infoIntroPattern = Pattern.compile("<meta property=\"og:description\" content=\"(.+?)\">");
////            Matcher infoIntromatcher = infoIntroPattern.matcher(info);
////            System.out.println(infoIntromatcher.find());
////            if (infoIntromatcher.find()){
////                intro=infoIntromatcher.group(1);
////                System.out.println(intro);
////            }else {
////                System.out.println("小说简介不存在");
////            }
////
////
////            //暂时只采集列表第一本书
////            return;
////        }
////
//
//    }

    /**
     * step.1
     * 获取目标资源
     * @param url
     * @return
     */
    public static String getSource(String url) {
        String html = new String();
        HttpGet httpget = new HttpGet(url);     //创建Http请求实例，URL 如：https://cd.lianjia.com/
        // 模拟浏览器，避免被服务器拒绝，返回返回403 forbidden的错误信息
        httpget.setHeader("User-Agent",
                "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.84 Safari/537.36");

        CloseableHttpResponse response = null;
        CloseableHttpClient httpclient = HttpClients.createDefault();   // 使用默认的HttpClient
        try {
            response = httpclient.execute(httpget);
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {     // 返回 200 表示成功
                html = EntityUtils.toString(response.getEntity(), "gbk");     // 获取服务器响应实体的内容
//                html = EntityUtils.toString(response.getEntity());     // 获取服务器响应实体的内容
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (response != null) {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return html;
    }

    /**
     * step.2
     * 获取列表url
     * @param html
     * @return
     */
    public static List< Map<String,Object>> getList(String html){

        //获取所有满足条件的list列表规则
        Pattern p = Pattern.compile("<span class=\"s2\"><a href=\"/\\d+_(\\d+)/\">(.+?)</a></span><span class=\"s3\">");
        Matcher m = p.matcher(html);
        //存放列表信息集合
        List< Map<String,Object>> l=new ArrayList<>();
        while (m.find()){
            //存放单行id和名称
            Map<String,Object> map=new HashMap<>();
            //处理单条数据
            String list = m.group();
            //获取名称
            Pattern namep = Pattern.compile("<span class=\"s2\"><a href=\"/\\d+_\\d+/\">(.+?)</a></span><span class=\"s3\">");
            Matcher nameMatcher = namep.matcher(list);
            String name=null;
            Long id=null;
            while (nameMatcher.find()){
                 name = nameMatcher.group(1);
            }
            //获取id
            Pattern idp = Pattern.compile("<span class=\"s2\"><a href=\"/\\d+_(\\d+)/\">.+?</a></span><span class=\"s3\">");
            Matcher idMatcher = idp.matcher(list);
            while (idMatcher.find()){
                 id = Long.valueOf(idMatcher.group(1));
            }
            if (name!=null&&id!=null){
                map.put("id",id);
                map.put("name",name);
            }

            logger.info("正在采集"+"id:"+id+",name:"+name);
            if (map!=null)
            l.add(map);
        }
//        System.out.println(JSON.toJSONString(l));

        return l;
    }


    /**
     * step.3
     * 获取基础信息
     * @param url
     * @return
     */
    public static String getInfo(String url){
        //获取信息页代码
        String html = getSource(url);
        Pattern namep = Pattern.compile("<meta property=\"og:title\" content=\"(.+?)\"/>");
        Pattern sortp = Pattern.compile("<meta property=\"og:novel:category\" content=\"(.+?)\"/>");
        Pattern authorp = Pattern.compile("<meta property=\"og:novel:author\" content=\"(.+?)\"/>\n");
        Pattern introp = Pattern.compile("<meta property=\"og:description\" content=\"(?<str>[\\s|\\S]+?)\"/>\n");
        Pattern coverp = Pattern.compile("<meta property=\"og:image\" content=\"(.+?)\"/>\n");
        Pattern statusp = Pattern.compile("<meta property=\"og:novel:status\" content=\"(.+?)\"/>\n");

        Matcher namem = namep.matcher(html);
        Matcher sortm = sortp.matcher(html);
        Matcher authorm = authorp.matcher(html);
        Matcher introm = introp.matcher(html);
        Matcher coverm = coverp.matcher(html);
        Matcher statusm = statusp.matcher(html);

        String name=null;
        String sort=null;
        String author=null;
        String intro=null;
        String cover=null;
        String status=null;
        while (namem.find()){
             name = namem.group(1);
        }

        while (sortm.find()){
             sort = sortm.group(1);
        }

        while (authorm.find()){
             author = authorm.group(1);
        }

        while (introm.find()){
             intro = introm.group(1);
        }

        while (coverm.find()){
             cover = coverm.group(1);
        }

        while (statusm.find()){
             status = statusm.group(1);
        }

        System.out.println(name);
        System.out.println(sort);
        System.out.println(author);
        System.out.println(intro);
        System.out.println(cover);
        System.out.println(status);


        return null;
    }

    /**
     * step.3
     * 获取目录
     * @param url
     * @return
     */
    public static String getDir(String url){
        String html = getSource(url);
        Pattern urlp= Pattern.compile("<dd><a href =\"/\\d+_\\d+/\\d+.html\">.+?</a></dd>");
        Matcher urlm = urlp.matcher(html);
        List<String> urls=new ArrayList<>();
        while (urlm.find()){
            String dirUrl = urlm.group();
            urls.add(dirUrl);
        }

        List<Map<String,String>> chapterInfo=new ArrayList<>();

        for (int i = 0; i < urls.size(); i++) {
            //存放单个章节信息
            Map<String,String> chapter=new HashMap<>();
            Pattern namep = Pattern.compile("<dd><a href =\"/\\d+_\\d+/\\d+.html\">(.+?)</a></dd>");
            Pattern idp = Pattern.compile("<dd><a href =\"/\\d+_\\d+/(\\d+).html\">.+?</a></dd>");
            Matcher namem = namep.matcher(urls.get(i));
            Matcher idm = idp.matcher(urls.get(i));
            String name=null;
            String id=null;

            while (namem.find()){
                 name = namem.group(1);
            }
            while (idm.find()){
                 id = idm.group(1);
            }
            logger.info("正在采集章节ID："+id+" 章节名称："+name);
            chapter.put("id",id);
            chapter.put("name",name);
            chapterInfo.add(chapter);
        }


        return null;
    }

    /**
     * step.4
     * 获取内容
     * @param url
     * @return
     */
    public static String getContent(String url){

        return null;
    }

    public static void main(String[] args) {
        //第一步，获取目标列表网页
        String html = getSource("https://www.biqukan.com/");
        //第二步，获取目标列表所有的书籍id和名称
        //创建存放url集合
        List<String> urls=new ArrayList<>();

        List<Map<String, Object>> list = getList(html);
        for (int i = 0; i < list.size(); i++) {
            Map<String, Object> m = list.get(i);
            Long id =(Long) m.get("id");
            Long subId=id/1000;
            String url="https://www.biqukan.com/"+subId+"_"+id+"/";
            urls.add(url);
        }

        //第三步 针对每一个url，获取基本信息
        for (int i = 0; i < urls.size(); i++) {
            getInfo(urls.get(i));
            getDir(urls.get(i));
            break;
        }


    }
}
