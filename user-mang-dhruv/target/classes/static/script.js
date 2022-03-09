feather.replace()


//

//document.getElementById('deleteUser').addEventListener('click', function(e) {
//    e.preventDefault;
//    var val =  document.getElementById('uid');
//    console.log("UID: "+ val.textContent);
//});


const targetDiv = document.getElementById("logout-box");
console.log(targetDiv)
const btn = document.getElementById("profile-icon");
console.log(btn)
btn.addEventListener("click", function(e) {
    e.preventDefault()
    if(targetDiv.style.display == "none"){
        targetDiv.style.display = "block"
    } else {
        targetDiv.style.display = "none"
    }
});


// var value = [[${isAUser}]];
// console.log(value)
// function validateUser(){
    
// }


//function validateUser(){
  //  console.log("function call success")
    //var user = document.getElementById('userV').innerText;
   // var user_val = user
   // console.log(user)
    //console.log(user_val);
    //if(user_val === "false"){
      //alert("Invalid Username and Password")
   //}
//}
function validateUser()
 {
     var username;
     username = document.getElementById("username").value;
     var password;
     password = document.getElementById("password").value;
     if(password == "")
     {
         alert("Please Enter Valid Credential!");
         return false;
     }
     else if(username == "" )
     {
         alert("Please Enter Valid Credential!");
         return false;
     }
     else if(password.length < 6)
     {
         alert("Password length must be atleast 6 characters");
         return false;
     }
     else {
         alert("Welcome "+username);
      }
 }


