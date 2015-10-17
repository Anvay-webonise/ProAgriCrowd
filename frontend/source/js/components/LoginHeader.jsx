var LoginHeader = React.createClass({
  render:function(){
    return (
      <div>
      LOGIN HEADER
      </div>
    );
  }
});

$(document).ready(function(){
  React.render( <LoginHeader />, document.getElementById('loginHeaderWrap'));
});
