var session = {
  set: function(key, value){
    sessionStorage.setItem(key, JSON.stringify(value));
  },
  get: function(key){
    return $.parseJSON(sessionStorage.getItem(key));
  },
  remove: function(key){
    sessionStorage.removeItem(key);
  }
};

var local = {
  set: function(key, value){
    localStorage.setItem(key, JSON.stringify(value));
  },
  get: function(key){
    return $.parseJSON(localStorage.getItem(key));
  },
  remove: function(key){
    localStorage.removeItem(key);
  }
};
