import React from "react"
import '../styles/LatestList.css'
import imgBoard from '../assets/latest-list.png'


const LatestList = ({latestList : {boardNumber, title, content, boardTitleImage,favoriteCount,commentCount,viewCount,writeDatetime,writerNickname,writerProfileImage}}) => {

    return (
     <div className='latestlist'>

        <div className="container">

            <div className='writer'>
                <div className="img"></div>

                <div className="text">
                    <span>{writerNickname}</span>
                    <span>{writeDatetime.slice(0,10)}</span>
                </div>
            </div>

            <div className="content">
                <h3>{title.length > 48 ? `${title.slice(0, 48)}...` : title}</h3>
                <p>{content.length > 105 ? `${content.slice(0,105)}...` : content}</p>
            </div>

            <div className='counter'>
                <span>댓글: {commentCount} 좋아요: {favoriteCount} 조회수: {viewCount}</span>
            </div>
        </div>
                {/* <img src={boardTitleImage !== 'null' ? boardTitleImage : imgBoard} alt=""/> */}
                <img src={imgBoard} alt="boardImage"/>
    </div>
    );
};

export default LatestList;