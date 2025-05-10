# ⏰ TRIPLE TIMER APPLICATION 🕒

Welcome to the Timer Application! A simple, Java-based app with a Graphical User Interface (GUI) that lets you manage multiple timers simultaneously. You can start and stop each timer independently, making it perfect for tracking time for various activities! ⏳

**✨ Features ✨**

⏰ Three independent timers with adjustable durations.

🔘 Each timer has a Start and Stop button.

⏲ Countdowns from the set time in seconds.

🛑 Stop the timer anytime you like.

🧵 Multithreading handles multiple timers at once, making them run smoothly.

Swing library (which is included by default in Java).

📂 Files Included 
📂
Main.java: The entry point that sets up the look and feel of the app and launches the GUI.

TimerGUI.java: The JFrame-based GUI to manage the timers and handle interactions.

Timer.java: Contains the timer logic with Runnable, handles countdowns and the start/stop functionality.

🛠️ How to Use 🛠️
Start a Timer:

Set the desired time in seconds using the JSpinner for any of the three timers ⏲️.

Click the Start button to begin the countdown 🚀.

Stop a Timer:

Once the timer starts, the Start button changes to Stop 🛑. Click Stop to halt the timer at any moment.

While the timer is running, the spinner will be disabled 🔒 and re-enabled once it stops or finishes.

📊 Example Usage 📊
Set Timer 1 to 30 seconds and click Start. The countdown will begin and update every second ⏳.

To stop Timer 1, click Stop 🛑.

Repeat for Timer 2 and Timer 3 independently. You can control them all at the same time!

🎨 User Interface 🎨
The app has a simple layout with:

Three spinners to set the time.

Three buttons to start and stop the timers.

Dynamic updates to show remaining time.





