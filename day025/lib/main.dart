import 'package:flutter/material.dart';
import 'package:day025/screen/browse_page.dart';
import 'package:day025/screen/clean_page.dart';
import 'package:day025/screen/nearby_share_page.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: ThemeData.dark(),
      home: const HomePage(),
      debugShowCheckedModeBanner: false,
    );
  }
}

class HomePage extends StatefulWidget {
  const HomePage({super.key});

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  int indexSelected = 1;
  final pages = [CleanPage(), BrowsePage(), NearbySharePage()];
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      bottomNavigationBar: NavigationBar(
        indicatorColor: Colors.lightBlue,
        selectedIndex: indexSelected,
        onDestinationSelected: (index) {
          setState(
            () {
              indexSelected = index;
            },
          );
        },
        destinations: [
          NavigationDestination(
              icon: Icon(Icons.auto_awesome_outlined), label: "Clean"),
          NavigationDestination(
              icon: Icon(Icons.manage_search), label: "Browse"),
          NavigationDestination(icon: Icon(Icons.share), label: "Nearby Share"),
        ],
      ),
      body: Column(
        children: [
          Padding(
            padding: const EdgeInsets.only(top: 12.0, left: 18, right: 18),
            child: SizedBox(
              height: 40,
              width: double.infinity,
              child: SearchBar(
                leading: IconButton(
                  onPressed: () {},
                  icon: const Icon(Icons.menu),
                ),
                hintText: "Search in Files",
                trailing: const <Widget>[Icon(Icons.search)],
              ),
            ),
          ),
          Expanded(child: pages[indexSelected])
        ],
      ),
    );
  }
}
