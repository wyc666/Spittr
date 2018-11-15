<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<section id="register" class="bg-light">
	<div class="container">
		<div class="row">
			<sf:form method="POST" commandName="spitter"
				enctype="multipart/form-data">
				<sf:errors path="*" element="div" cssClass="" />
				<sf:label path="name" cssErrorClass="">Enter your name :</sf:label>
				<sf:input path="name" cssErrorClass="" name="name" />
				<br>
               	
                	Choose your sex :<input type="radio" name="male"
					value="male" checked="checked">
				<input type="radio" name="female" value="female">
				<br>
				<sf:label path="email" cssErrorClass="">Enter your Email Adress:</sf:label>
				<sf:input path="email" cssErrorClass="" name="email" />
				<br>
				<sf:label path="phone" cssErrorClass="">Enter your phone:</sf:label>
				<sf:input path="phone" cssErrorClass="" name="phone" />
				<br>
				<sf:label path="password" cssErrorClass="">Enter your password:</sf:label>
				<sf:password path="password" cssErrorClass="" name="password" />
				<br>
				<label>Profile Picture</label>:
         			<input type="file" name="avatar"
					accept="image/jpeg,image/png,image/gif" />
				<br>
				<input type="submit" value="Register">
			</sf:form>
		</div>
	</div>
</section>