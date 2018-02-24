//Fetches notes from server as a JSON array

function loadLogin(){
    loadPageWithGetData("rest/time","startside.mustache");
}

function doLogin(){
    var username = document.getElementById("brugernavn").value;
    var password = document.getElementById("password").value;
    var loginData = {"brugernavn":username,"password":password};
    loadPageWithPostData("rest/login","loginsuccess.mustache", loginData)
}


function loadNotes(){
    loadPageWithGetData("rest/noter","noter.mustache");

}

function postNote(){
    var note = document.getElementById("note").value;
    loadPageWithPostData("rest/noter","noter.mustache", {tekst:note})
}


function deleteNote(id){
    loadPageWithDeleteData("rest/noter/" + id, "noter.mustache");
}