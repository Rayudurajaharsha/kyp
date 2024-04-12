import './NavBar.css'
function NavBar(){
  return <div>
<nav>

     
    <label className="logo">KYP</label>
    <ul>
     <li><a className="active" href="#">About us</a></li>
      <li><a href="#">Login</a></li>
      <li><a href="#">Signup/Register</a></li>
       
    </ul>
  </nav>
  </div>
}

export default NavBar;