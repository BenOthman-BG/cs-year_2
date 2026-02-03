import styles from "./App.module.css";

function App(props) {
  return (
    <>
      <div className={styles.container2}>
        <h1> hello world </h1>
        <h2> {props.name} is : </h2>
        <p>the best player in the world </p>
      </div>
    </>
  );
}

export default App;
