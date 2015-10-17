var hostUrl = "/rest/";

function doGet(url, isCompleteUrl, isSecured, successHandler, errorHandler){
  $.ajax({
      type: "GET",
      beforeSend: function (request)
      {
        if(isSecured){
          request.setRequestHeader("authToken", session.get('userKey'));
        }
      },
      url: isCompleteUrl?url:hostUrl+url,
      async :true,
      crossDomain: true,
      success:  function(result) {
        successHandler(result);
      },
      error: function(error) {
        errorHandler(error);
      }
  });
}
