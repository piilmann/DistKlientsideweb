var imageUrl = "images/galge.png"
var galgenummer = 0;
var correctLetter = 'A';

function guessLetter(input){
  var guessedLetter = input;
  console.log("Der blev gættet på bogstavet: "+ input)

  sendDataPost("rest/galgeleg","loginsuccess.mustache", guessedLetter);
  if(input == correctLetter){
    // Korrekt bogstav valgt
    galgenummer++;
    $("#btn"+input).attr("class","btn btn-success");
    updateImg();
  } else {
    // Forkert bogstav valgt
    galgenummer++;
    $("#btn"+input).attr("class","btn btn-danger");
    updateImg();
  }
}

function updateImg(){
  switch (galgenummer) {
      case 0:
          imageUrl = "images/galge.png";
          $("#galgen").attr("src",imageUrl);
          break;
      case 1:
          imageUrl = "images/forkert1.png";
          $("#galgen").attr("src",imageUrl);
          break;
      case 2:
          imageUrl = "images/forkert2.png";
          $("#galgen").attr("src",imageUrl);
          break;
      case 3:
          imageUrl = "images/forkert3.png";
          $("#galgen").attr("src",imageUrl);
          break;
      case 4:
          imageUrl = "images/forkert4.png";
          $("#galgen").attr("src",imageUrl);
          break;
      case 5:
          imageUrl = "images/forkert5.png";
          $("#galgen").attr("src",imageUrl);
          break;
      case 6:
          imageUrl = "images/forkert6.png";
          $("#galgen").attr("src",imageUrl);
          break;
      case 7:
          alert("Du tabte!")
          galgenummer = 0;
          resetButtonColor();
          updateImg();
          break;
  }
}
function resetButtonColor(){
  $("#btnWrapper button").each(function(){
    $(this).attr("class", "btn btn-primary");
});
}
