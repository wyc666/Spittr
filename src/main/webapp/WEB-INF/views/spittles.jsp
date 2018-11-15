
<%@ page import="nju.edu.wyc.vo.Spittle" %>
<%@ page import="java.util.List" %>

    <title>我的动态列表</title>

<!-- banner -->
<%
    List<Spittle> spittleList = (List<Spittle>) request.getAttribute("spittleList");
%>
<!-- //banner -->

<div class="spittleInfoList">
    <div class="container">
        <div class="col-md-12">
            <div class="course_list">
                <div class="table-header clearfix">
                    <div class="auther_col">发布人</div>
                    <div class="text_col">内容</div>
                </div>
                <ul class="table-list">
                    <%
                        if(spittleList != null)
                            for (int i=0;i<spittleList.size();i++) {
                                Spittle spittle = spittleList.get(i);
                    %>
                    <li class="clearfix">
                        <div class="author_col"><%=spittle.getAuther_Id() %></div>                 
                        <div class="text_col"><%=spittle.getText() %></div>
                    </li>
                    <% } %>
                </ul>
            </div>
        </div>
        <div class="clearfix"> </div>
    </div>
</div>
