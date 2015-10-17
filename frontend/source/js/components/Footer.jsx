var Footer = React.createClass({
  render:function(){
    return (
      <div>
      FOOTER
      </div>
    );
  }
});

$(document).ready(function(){
  React.render( <Footer />, document.getElementById('footerWrap'));
});
