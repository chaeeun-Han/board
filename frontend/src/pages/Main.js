import React, { useEffect, useState } from 'react';
import axios from 'axios';

import styles from '../styles/Main.module.css';
import Top3List from '../components/Top3List';
import Header from '../components/Header'

function Main(){
    const [top3, setTop3] = useState([]);

    useEffect(() => {
        const fetchData = async () => {
          try {
            const response = await axios.get('http://localhost:3000/data/db.json');
            setTop3(response.data.top3List);
            console.log(response.data.top3List);
          } catch (error) {
            console.error('Error fetching data:', error);
          }
        };
    
        fetchData();
      }, []);

    return(
        
        <div className={styles.title}>
          <div><Header /></div>
            <h2><span>Hoons board</span>에서<br/>다양한 이야기를 나눠보세요</h2>

            <h3>주간 TOP 3 게시물</h3>

            <div className={styles.containerTop3}>
                
                {top3.map((top3List) => (
                       <Top3List top3List={top3List} key={top3List.boardNumber} />
                    ))}
            </div>
            
            <h3>최신 게시물</h3>
            <div className={styles.containerLatest}>
                
            </div>
        </div>
    );
}

export default Main;