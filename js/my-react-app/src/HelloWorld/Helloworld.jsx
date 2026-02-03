import styles from "./Helloworld.module.css"

function HelloWorld() {
  return (
    <>
      <div className={styles.container}> 
        <h1 className={styles.title}>this is hello world nav bar</h1>
      </div>
    </>
  )
}

export default HelloWorld