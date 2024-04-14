import './Hero.css';
import Carousel from 'react-material-ui-carousel';
import { Paper } from '@mui/material';

const Hero = ({ movies }) => {
  // Ensure movies is always an array, defaulting to an empty array if it's undefined or not an array
  const movieList = Array.isArray(movies) ? movies : [];

  return (
    <div className='movie-carousel-container'>
      <Carousel>
        {movieList.map((movie) => (
          <Paper key={movie.id}>
            <div className='movie-card-container'>
              <div className='movie-card'>
                <div className="movie-poster">
                  <img src={movie.poster} alt=""/>
                </div>
                <div className="movie-title">
                  <h4>{movie.title}</h4>
                </div>
              </div>
            </div>
          </Paper>
        ))}
      </Carousel>
    </div>
  );
}

export default Hero;
