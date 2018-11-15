
<!-- Header -->
<header class="masthead">
	<div class="container">
		<div class="intro-text">
			<div class="intro-lead-in">Welcome To Spittr World!</div>
			<div class="intro-heading text-uppercase">It's Time To Glance
				The World</div>
			<a class="btn btn-primary btn-xl text-uppercase js-scroll-trigger"
				href="<%=request.getContextPath()%>/spitter/register">Register</a> <a
				class="btn btn-primary btn-xl text-uppercase js-scroll-trigger"
				href="<%=request.getContextPath()%>/spitter/register">Logging</a>
		</div>
	</div>
</header>

<!-- Contact -->
<section id="contact">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h2 class="section-heading text-uppercase">Contact Us</h2>
				<h3 class="section-subheading text-muted">We need more info to
					improve and more talents to join in.</h3>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<form id="contactForm" name="sentMessage" novalidate="novalidate">
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<input class="form-control" id="name" type="text"
									placeholder="Your Name *" required="required"
									data-validation-required-message="Please enter your name.">
								<p class="help-block text-danger"></p>
							</div>
							<div class="form-group">
								<input class="form-control" id="email" type="email"
									placeholder="Your Email *" required="required"
									data-validation-required-message="Please enter your email address.">
								<p class="help-block text-danger"></p>
							</div>
							<div class="form-group">
								<input class="form-control" id="phone" type="tel"
									placeholder="Your Phone *" required="required"
									data-validation-required-message="Please enter your phone number.">
								<p class="help-block text-danger"></p>
							</div>
						</div>
						<div class="col-md-6">
							<div class="form-group">
								<textarea class="form-control" id="message"
									placeholder="Your Message *" required="required"
									data-validation-required-message="Please enter a message."></textarea>
								<p class="help-block text-danger"></p>
							</div>
						</div>
						<div class="clearfix"></div>
						<div class="col-lg-12 text-center">
							<div id="success"></div>
							<button id="sendMessageButton"
								class="btn btn-primary btn-xl text-uppercase" type="submit">Send
								Message</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</section>