import React, { useState } from 'react'
import LogoImg from '../assets/navbar-logo.png'
import InstaIcon from '../assets/insta.png'
import BlogIcon from '../assets/blogIcon.jpg'
import '../styles/Footer.css'

const Footer = () => {
  const[click, setClick] = useState(false)
  const handleClick = () => setClick(!click);

  return (
    <div className='footer'>
        <div className='container'>
            <div className='info'>
                <span>
                    <img src={LogoImg} />
                    Hoons Board
                </span>
                <h3>Copyright © 2022 Jukoyakki. All Rights Reserved.</h3>
            </div>
            <div className='infoIcon'>
                <img src={InstaIcon} />
                <img src={BlogIcon}/>
                <h3>admf@gmail.com</h3>
            </div>
        </div>
    </div>
  )
}

export default Footer