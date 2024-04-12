import React, { useState, useEffect } from 'react';
import axios from 'axios';

interface Mobile {
  id: number;
  brand: string;
  model: string;
  price: number;
  rating: number;
  imageurl: string; 
}

const Displayall: React.FC = () => {
  const [mobiles, setMobiles] = useState<Mobile[]>([]);
  const [isLoading, setIsLoading] = useState(false);
  const [error, setError] = useState(null);

  const apiUrl = 'http://localhost:8080/kyp/getdata'; 

  useEffect(() => {
    const fetchMobiles = async () => {
      setIsLoading(true);
      setError(null);

      try {
        const response = await axios.get<Mobile[]>(apiUrl);
        setMobiles(response.data);
      } catch (error) {
        console.error('Error fetching mobiles:', error);
        //setError(error.message || 'Unknown error'); 
      } finally {
        setIsLoading(false);
      }
    };

    fetchMobiles();
  }, []);

  return (
    <div>
      <h1>Mobiles:</h1>
      {isLoading && <div className="loader">Loading...</div>} {}
      {error && (
        <p className="error-message">Error fetching mobiles: {error}</p>
      )}
      {mobiles.length === 0 && <p>No mobiles available.</p>} {}
      {mobiles.length > 0 && (
        <ul>
          {mobiles.map((mobile) => (
            <li key={mobile.id}>
              {mobile.brand} - {mobile.model} - Price: ₹{mobile.price} - Rating: {mobile.rating}
              <br />
              <img src={mobile.imageurl} alt={mobile.model} /> {}
            </li>
          ))}
        </ul>
      )}
    </div>
  );
};

export default Displayall;
