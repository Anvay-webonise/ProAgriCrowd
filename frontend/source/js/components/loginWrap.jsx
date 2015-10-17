var LoginWrapHeader = React.createClass({
  render: function() {
    return (
      <section class="navigation">
            <header>
                <div class="header-content">
                    <div class="logo"><a href="#"><img src="img/sedna-logo.png" alt="Sedna logo"></a></div>
                    <div class="header-nav">
                        <nav>
                            <ul class="primary-nav">
                                <li><a href="#">Upcoming Events</a></li>
                                <li><a href="#">View Experts</a></li>
                            </ul>
                            <ul class="member-actions">
                                <li><a href="#download" class="btn-white btn-small">Sign up</a></li>
                            </ul>
                        </nav>
                    </div>
                    <div class="navicon">
                        <a class="nav-toggle" href="#"><span></span></a>
                    </div>
                </div>
            </header>
    </section>
      );
  }
});


var LoginWrap = React.createClass({
  render: function() {
    return (
    <LoginWrapHeader />
    <section class="sign-up section-padding text-center login-first" id="download">
        <div class="container">
            <div class="row">
                <div class="col-md-6 col-md-offset-3">
                    <h3>Get started with ProAgriCrowd, Absolutely Free !</h3>
                    <p>Get exclusive access to our product now.</p>
                    <form class="signup-form" action="#" method="POST" role="form">
                        <div class="form-input-group">
                            <i class="fa fa-envelope"></i><input type="text" class="" placeholder="Enter your email" required>
                        </div>
                        <div class="form-input-group">
                            <i class="fa fa-lock"></i><input type="text" class="" placeholder="Enter your password" required>
                        </div>
                        <button type="submit" class="btn-fill sign-up-btn">Login</button>
                    </form>
                </div>
            </div>
        </div>
    </section>
    <section class="to-top">
        <div class="container">
            <div class="row">
                <div class="to-top-wrap">
                    <a href="#top" class="top"><i class="fa fa-angle-up"></i></a>
                </div>
            </div>
        </div>
    </section>
    );
  }
});