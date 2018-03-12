var imageUrl = "images/galge.png"
var galgenummer = 0;

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
          updateImg();
          break;
  }
}


function next(){
  galgenummer++;
  updateImg();
}
