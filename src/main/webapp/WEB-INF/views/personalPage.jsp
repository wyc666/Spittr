
<%@ page import="nju.edu.wyc.vo.Spitter"%>

<title>个人信息</title>


<%-- <jsp:include page="header.jsp" /> --%>
<!-- banner -->
<%
	Spitter spitter = (Spitter) request.getAttribute("spitter");
%>
<!-- //banner -->

<div class="personalInfo">
	<div class="container">
		<div class="col-md-12">
			<div class="course_list">

				<ul class="table-list">

					<li class="clearfix">
						<div class="name"><%=spitter.getName()%></div>
						<div class="sex"><%=spitter.getSex()%></div>
						<div class="phone"><%=spitter.getPhone()%></div>
					</li>

				</ul>
			</div>
		</div>
		<div class="clearfix"></div>
	</div>
</div>