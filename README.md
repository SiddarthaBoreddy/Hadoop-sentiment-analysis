# 📊 Hadoop-Based Sentiment Analysis with MapReduce  

## 📖 Overview  

This project implements **Sentiment Analysis using Hadoop's MapReduce framework**. It processes large-scale text data (such as tweets) to classify sentiment into **positive, negative, or neutral** categories. The system leverages Hadoop's distributed processing capabilities to efficiently analyze vast amounts of unstructured text data.  

The key components include:  
- **SentimentAnalysisDriver.java** – Manages the execution of MapReduce jobs.  
- **SentimentMapper.java** – Processes input data and assigns preliminary sentiment scores.  
- **SentimentReducer.java** – Aggregates sentiment data and finalizes classification.  
- **plotting.ipynb** – Visualizes sentiment analysis results using Matplotlib.  

---

## 🛠 Technologies Used  

- **Java (Hadoop MapReduce)** – Core implementation for distributed sentiment analysis.  
- **Python (Matplotlib, Pandas)** – Data visualization and analysis.  
- **HDFS (Hadoop Distributed File System)** – Storing and processing large datasets.  
- **Apache Hadoop** – Distributed data processing framework.  

---

## 📌 Features  

✅ **Distributed Sentiment Analysis using Hadoop**  
✅ **MapReduce Implementation for Large-Scale Processing**  
✅ **Sentiment Classification: Positive, Neutral, Negative**  
✅ **Data Visualization using Python (Matplotlib & Pandas)**  
✅ **Efficient Text Processing for Unstructured Data**  

---

## 📂 Project Structure  

```
📁 Sentiment-Analysis-Hadoop/
│── SentimentAnalysisDriver.java  # Main driver for MapReduce execution
│── SentimentMapper.java          # Hadoop Mapper for sentiment classification
│── SentimentReducer.java         # Hadoop Reducer for aggregating sentiment scores
│── plotting.ipynb                # Python notebook for visualization
│── README.md                     # Project documentation
```

---

## 🚀 How It Works  

1️⃣ **Prepare Input Data** – Store the dataset (e.g., tweets) in **HDFS**.  
2️⃣ **Run the Hadoop Job** – Execute the **MapReduce** job to analyze sentiment.  
3️⃣ **Process the Results** – Retrieve output from HDFS and analyze aggregated sentiment.  
4️⃣ **Visualize Sentiment Trends** – Use `plotting.ipynb` to create sentiment charts.  

---

## 🏃 Running the Sentiment Analysis  

### **1️⃣ Upload Dataset to HDFS**  
```sh
hdfs dfs -put tweets.txt /user/hadoop/input
```

### **2️⃣ Compile and Run MapReduce Job**  
```sh
hadoop com.sun.tools.javac.Main SentimentAnalysisDriver.java  
jar cf sentiment.jar SentimentAnalysisDriver*.class SentimentMapper*.class SentimentReducer*.class  
hadoop jar sentiment.jar SentimentAnalysisDriver /user/hadoop/input /user/hadoop/output
```

### **3️⃣ Retrieve Results from HDFS**  
```sh
hdfs dfs -cat /user/hadoop/output/part-r-00000
```

### **4️⃣ Visualize Results using Python**  
```sh
jupyter notebook plotting.ipynb
```

---

## 🔐 Data Considerations  

- **Text Preprocessing** – Tokenization, stopword removal, and normalization improve accuracy.  
- **Scalability** – Hadoop enables processing of **millions of text records** efficiently.  
- **Bias & Sentiment Accuracy** – Results depend on dataset quality and lexicon-based sentiment scoring.  

---

## 🔮 Future Enhancements  

🔹 **Integrate Machine Learning (NLTK, TensorFlow)** for improved sentiment detection.  
🔹 **Real-Time Sentiment Analysis** using Apache Spark Streaming.  
🔹 **Support for Multiple Languages** via NLP libraries.  
🔹 **Improved Visualization** with interactive dashboards.  

---

## 📜 References  

- [Apache Hadoop Documentation](https://hadoop.apache.org/)  
- [Sentiment Analysis with MapReduce](https://medium.com/)  
- [Python Data Visualization](https://matplotlib.org/)  

---

## 📧 Contact  

**Author:** Siddartha Reddy Boreddy  
📍 **SUNY Binghamton**  
✉️ **Email:** sboreddy@binghamton.edu

---

### ⭐ If you find this project helpful, feel free to star the repository! 🚀  
