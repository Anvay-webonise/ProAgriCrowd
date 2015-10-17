var Header = React.createClass({
  render:function(){
    return (
      <div>
      HEADER
      </div>
    );
  }
});

$(document).ready(function(){
  React.render( <Header />, document.getElementById('headerWrap'));
});
