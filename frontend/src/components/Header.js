import React, { useState } from 'react'
import NavBarImg from '../assets/navbar-logo.png'
import SearchIcon from '../assets/search-logo.png'
import '../styles/Header.css'

const Navbar = () => {
  const[click, setClick] = useState(false)
  const handleClick = () => setClick(!click);

  return (
    <div className='navbar'>
        <div className='container'>
            <span>
                <img src={NavBarImg} />
            Hoons Board
            </span>
            <div className='btn'>
                <form className='search'>
                    <input type='text'/>
                    <button><img src={SearchIcon}/></button>
                </form>
                <button>로그인</button>
            </div>
        </div>
    </div>
  )
}

export default Navbar