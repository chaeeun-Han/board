import React from "react";
import styles from '../styles/Top3List.module.css';
import imgBoard from '../imageTest.png'
import imgProfile from '../profileTest.png'

const Top3List = ({top3List : {boardNumber, title, content, boardTitleImage,favoriteCount,commentCount,viewCount,writeDatetime,writerNickname,writerProfileImage}}) => {

    return (
     <div className={styles.top3}>
                {/* <img src={boardTitleImage !== 'null' ? boardTitleImage : imgBoard} alt=""/> */}
                <img src={imgBoard}/>

                
        <div className={styles.text}>
            <div className={styles.writer}>
                <img src={imgProfile}/>
                <h3>{writerNickname}</h3>
                <span>{writeDatetime}</span>
            </div>
            <div>
                <h3>{title.length > 25 ? `${title.slice(0,25)}`+ "..." : title}</h3>
                <p>{content.length > 30 ? `${content.slice(0,30)}`+ "..." : content}</p>
            </div>

            <div className={styles.counter}>
                <span>댓글: {commentCount} 좋아요: {favoriteCount} 조회수: {viewCount}</span>
            </div>
        </div>
    </div>
    );
};

export default Top3List;