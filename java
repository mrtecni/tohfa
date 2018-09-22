<script type='text/javascript'>
/*<![CDATA[*/
var postperpage=5;var numshowpage=4;var upPageWord ='السابق';var downPageWord ='التالي';var urlactivepage=location.href;var home_page="/";
/*]]>*/
</script>
<script type='text/javascript'>/*<![CDATA[*/
var linkblog=window.location.protocol+"//"+window.location.host+window.location.pathname+window.location.search;linkblog=encodeURIComponent(linkblog);var twshare="https://twitter.com/intent/tweet?url="+linkblog,fbshare="https://www.facebook.com/sharer/sharer.php?v=4&amp;u="+linkblog,bq=$("blockquote").text();$("blockquote").append('<div class="quote-share"><a target="_blank" href="'+fbshare+"&quote="+bq+'"  class="quote-fb"><i class="fa fa-facebook"></i></a><a target="_blank"  href="'+twshare+"&text="+bq+'" ><i class="fa fa-twitter"></i></a></div>');
//]]>
</script>
<script type='text/javascript'>
//<![CDATA[
// Loader
$(document).ready(function(){$("body").removeClass("page-isload"),$("#pagingx").fadeOut(8000),$("#loader").fadeOut(8000)});
//]]>
</script>
<script type='text/javascript'>
//<![CDATA[
$(function(){$(window).scroll(function(){$(this).scrollTop()>600?$(".back-totop").addClass('arlniain'):$(".back-totop").removeClass('arlniain')}),$(".back-totop").click(function(){return $("html,body").animate({scrollTop:0},600),!1})});
//]]>
</script>
<script type='text/javascript'>/*<![CDATA[*/
$(function() {
        "use strict";
        $("#postAD-top")["append"]($("#HTML201"));
        $("#postAD-bottom")["append"]($("#HTML203"));
        var _0x8468x0 = Math["floor"]($(".post-body *")["length"] / 2);
        $(".post-body *:eq(" + _0x8468x0 + ")")["after"]($("#HTML202"));
       
});
/*]]>*/</script>
<script type='text/javascript'>
//<![CDATA[
jQuery(document).ready(function(){var o=220,r=600;jQuery(window).scroll(function(){jQuery(this).scrollTop() > o?jQuery("#scrollToTop").fadeIn(r):jQuery("#scrollToTop").fadeOut(r)})});
$(function(){$("a[href*=#]:not([href=#])").click(function(){if(location.pathname.replace(/^\//,"")==this.pathname.replace(/^\//,"")&&location.hostname==this.hostname){var t=$(this.hash);if(t=t.length?t:$("[name="+this.hash.slice(1)+"]"),t.length)return $("html,body").animate({scrollTop:t.offset().top},600),!1}})});
//]]>
</script>
<script type='text/javascript'>
//<![CDATA[
// Tombol Reaksi Vicomi
!function(){var e=document.createElement("script");e.async=!0,e.src="https://assets-prod.vicomi.com/vicomi.js?token=1d852d9a6638475caf87db6cf9dd5255";var c=document.getElementsByTagName("script")[0];c.parentNode.insertBefore(e,c)}();
//]]>
</script>
<script type='text/javascript'>
// <![CDATA[
// News Ticker plugin ~ URL: http://jonmifsud.com/open-source/jquery/jquery-webticker
(function(e){function n(e,t){var s=e.data("settings");if(typeof t==="undefined")t=false;if(t){i(e)}var o=r(e);e.animate(o.css,o.time,"linear",function(){e.css(s.direction,"0");n(e,true)})}function r(e){var t=e.data("settings");var n=e.children().first();var r=Math.abs(-e.css(t.direction).replace("px","").replace("auto","0")-n.outerWidth(true));var t=e.data("settings");var i=r*1e3/t.speed;var s={};s[t.direction]=e.css(t.direction).replace("px","").replace("auto","0")-r;return{css:s,time:i}}function i(e){var t=e.data("settings");e.css("transition-duration","0s").css(t.direction,"0");var n=e.children().first();if(n.hasClass("webticker-init"))n.remove();else e.children().last().after(n)}function s(e,t){if(typeof t==="undefined")t=false;if(t){i(e)}var n=r(e);var s=n.time/1e3;s+="s";e.css(n.css).css("transition-duration",s)}function o(t,n,r){var i;e.get(t,function(t){var s=e(t);s.find("item").each(function(){var t=e(this),n={title:t.find("title").text(),link:t.find("link").text()};listItem="<li><a href='"+n.link+"'>"+n.title+"</a></li>";i+=listItem});r.webTicker("update",i,n)})}function u(t){var n=t.data("settings");t.width("auto");var r=0;t.children("li").each(function(){r+=e(this).outerWidth(true)});if(r<t.parent().width()||t.children().length==1){if(n.duplicate){itemWidth=Math.max.apply(Math,t.children().map(function(){return e(this).width()}).get());while(r-itemWidth<t.parent().width()||t.children().length==1){var i=t.children().clone();t.append(i);r=0;t.children("li").each(function(){r+=e(this).outerWidth(true)});itemWidth=Math.max.apply(Math,t.children().map(function(){return e(this).width()}).get())}}else{var s=t.parent().width()-r;s+=t.find("li:first").width();var o=t.find("li:first").height();t.append('<li class="ticker-spacer" style="width:'+s+"px;height:"+o+'px;"></li>')}}if(n.startEmpty){var o=t.find("li:first").height();t.prepend('<li class="webticker-init" style="width:'+t.parent().width()+"px;height:"+o+'px;"></li>')}r=0;t.children("li").each(function(){r+=e(this).outerWidth(true)});t.width(r+200);widthCompare=0;t.children("li").each(function(){widthCompare+=e(this).outerWidth(true)});while(widthCompare>=t.width()){t.width(t.width()+200);widthCompare=0;t.children("li").each(function(){widthCompare+=e(this).outerWidth(true)})}}var t=function(){var e=document.createElement("p").style,t=["ms","O","Moz","Webkit"];if(e["transition"]=="")return true;while(t.length)if(t.pop()+"Transition"in e)return true;return false}();var a={init:function(r){r=jQuery.extend({speed:50,direction:"right",moving:true,startEmpty:true,duplicate:false,rssurl:false,hoverpause:true,rssfrequency:0,updatetype:"reset"},r);return this.each(function(){jQuery(this).data("settings",r);var i=jQuery(this);i.addClass("newsticker");var a=i.wrap("<div class='mask'></div>");a.after("<span class='tickeroverlay-right'>&nbsp;</span><span class='tickeroverlay-left'>&nbsp;</span>");var f=i.parent().wrap("<div class='tickercontainer'></div>");u(i);if(r.rssurl){o(r.rssurl,r.type,i);if(r.rssfrequency>0){window.setInterval(function(){o(r.rssurl,r.type,i)},r.rssfrequency*1e3*60)}}if(t){i.css("transition-duration","0s").css(r.direction,"0");s(i,false);i.on("transitionend webkitTransitionEnd oTransitionEnd otransitionend",function(t){if(!i.is(t.target)){return false}s(e(this),true)})}else{n(e(this))}if(r.hoverpause){i.hover(function(){if(t){var n=e(this).css(r.direction);e(this).css("transition-duration","0s").css(r.direction,n)}else jQuery(this).stop()},function(){if(jQuery(this).data("settings").moving){if(t){s(e(this),false)}else{n(i)}}})}})},stop:function(){var n=e(this).data("settings");if(n.moving){n.moving=false;return this.each(function(){if(t){var r=e(this).css(n.direction);e(this).css("transition-duration","0s").css(n.direction,r)}else e(this).stop()})}},cont:function(){var r=e(this).data("settings");if(!r.moving){r.moving=true;return this.each(function(){if(t){s(e(this),false)}else{n(e(this))}})}},update:function(t,n,r,i){n=n||"reset";if(typeof r==="undefined")r=true;if(typeof i==="undefined")i=false;if(typeof t==="string"){t=e(t)}var s=e(this);s.webTicker("stop");var o=e(this).data("settings");if(n=="reset"){s.html(t);s.css(o.direction,"0");u(s)}else if(n=="swap"){s.children("li").addClass("old");for(var a=0;a<t.length;a++){id=e(t[a]).data("update");match=s.find('[data-update="'+id+'"]');if(match.length<1){if(r){if(s.find(".ticker-spacer:first-child").length==0&&s.find(".ticker-spacer").length>0){s.children("li.ticker-spacer").before(t[a])}else{s.append(t[a])}}}else s.find('[data-update="'+id+'"]').replaceWith(t[a]);}s.children("li.webticker-init, li.ticker-spacer").removeClass("old");if(i)s.children("li").remove(".old");stripWidth=0;s.children("li").each(function(){stripWidth+=e(this).outerWidth(true)});s.width(stripWidth+200)}s.webTicker("cont")}};e.fn.webTicker=function(t){if(a[t]){return a[t].apply(this,Array.prototype.slice.call(arguments,1))}else if(typeof t==="object"||!t){return a.init.apply(this,arguments)}else{e.error("Method "+t+" does not exist on jQuery.webTicker")}}})(jQuery);
//]]>
</script>
<script type='text/javascript'>
// <![CDATA[
//]]>
</script>
<script>
<script type='text/javascript'>
//<![CDATA[	

// This is function to Comment Photo And Videos 
! function () {
for (var a =
/(\[img\])?((http:|https:)?\/\/\S*?\.(jpg|gif|png|bmp|jpeg]))(\[\/img\])?/gi,
b =
/(\[vid\])?http(?:s?):\/\/(?:www\.)?youtu(?:be\.com\/watch\?v=|\.be\/)([\w\-\_]*)(&(amp;)?‌​[\w\?‌​=]*)?(\[\/vid\])?/gi,
c =
/(\[vid\])?(http:|https:)?\/\/(vimeo.com)\/([0-9]*)(\[\/vid\])?/gi,
d = document.querySelectorAll(".comment-content"), e = 0; e < d.length; e++) {
for (var f = d[e].getElementsByTagName("a"), g = 0; g < f.length; g++)
if (f[g].href.match(a) || f[g].href.match(b) || f[g].href.match(c)) {
var h = document.createElement("span");
h.innerHTML = f[g].href;
var i = f[g];
i.parentNode.insertBefore(h, i), f[g].href = "", f[g].innerHTML =
""
} var j = d[e].innerHTML;
j = j.replace(a,
'<img style="max-width: 100%; height: auto;display: blocK;margin: 10px auto;" src="$2"" alt=""/>'
), j = j.replace(b,
'<div style="position:relative;width:100%;height:0;padding-bottom:56.25%;overflow:hidden;margin:20px auto;"><iframe style="position: absolute;width: 100%;height: 100%;top: 0;left: 0;" src="https://www.youtube.com/embed/$2" frameborder="0" allowfullscreen></iframe></div>'
), j = j.replace(c,
'<div style="position:relative;width:100%;height:0;padding-bottom:56.25%;overflow:hidden;margin:20px auto;"><iframe style="position: absolute;width: 100%;height: 100%;top: 0;left: 0;" src="https://player.vimeo.com/video/$4" frameborder="0" allowfullscreen></iframe></div>'
), d[e].innerHTML = j
}
}();

//]]>
</script>
<script type='text/javascript'>
//<![CDATA[
/*اعدادات السلايدر*/
var MONTH_FORMAT=[,"كانون الثاني","فبراير","مارس","أبريل","ماي","يونيو","يوليو","أغسطس","سبتمبر","أكتوبر","نوفمبر","ديسمبر"]; 
// هنا تغيير اسم الاشهر لو مدونتك اجنبية
var NO_IMAGE = "http://3.bp.blogspot.com/-Yw8BIuvwoSQ/VsjkCIMoltI/AAAAAAAAC4c/s55PW6xEKn0/s1600-r/nth.png"; // هنا صورة البديلة
var CAROUSEL_NUM = 6; // هنا تتحكم بعدد المواضيع
var node = document.createElement('script'); node.type = 'text/javascript'; node.async = true; node.src = 'https://rawgit.com/abdelalilebbihi/abdou_tech/master/gadget/slider_star1.js'; var runscript = document.getElementsByTagName('script')[0]; runscript.parentNode.insertBefore(node, runscript);
//]]>
</script>
