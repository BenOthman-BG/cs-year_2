let role = prompt(" enter name ");

role = role.toLocaleLowerCase();
switch (role) {
  case "othman":
    document.writeln(" you are othman the 1ere place ");
    break;
  case "hamza":
    document.writeln("you are hamza 2and place ");
    break;
  case "ali":
    document.writeln("you are ali 3rd place ");
    break;
  default:
    document.writeln("I don't know you ");
}
