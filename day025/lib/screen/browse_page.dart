import 'package:flutter/material.dart';
import 'package:day025/constant/text_style.dart';
import 'package:day025/widget/recent_list.dart';
import 'package:day025/widget/custom_list_tile.dart';

class BrowsePage extends StatefulWidget {
  const BrowsePage({super.key});

  @override
  State<BrowsePage> createState() => _BrowsePageState();
}

class _BrowsePageState extends State<BrowsePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        body: Padding(
      padding: EdgeInsets.only(top: 22.0, left: 18.0, right: 18.0),
      child: SingleChildScrollView(
        scrollDirection: Axis.vertical,
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            const Text(
              "Recent",
              style: kTextStyleBody2Regular,
            ),
            const SizedBox(
              height: 12,
            ),
            const SingleChildScrollView(
              scrollDirection: Axis.horizontal,
              child: Row(
                children: [
                  RecentList(
                    image1: NetworkImage('https://picsum.photos/250?image=1'),
                    image2: NetworkImage('https://picsum.photos/250?image=2'),
                    image3: NetworkImage('https://picsum.photos/250?image=3'),
                    image4: NetworkImage('https://picsum.photos/250?image=4'),
                    text: Text("Screenshots", style: kTextStyleBody2Regular),
                    subtext: Text(
                      "Images",
                      style: TextStyle(fontSize: 12, color: Colors.grey),
                    ),
                  ),
                  SizedBox(
                    width: 6,
                  ),
                  RecentList(
                    image1: NetworkImage('https://picsum.photos/250?image=5'),
                    image2: NetworkImage('https://picsum.photos/250?image=6'),
                    image3: NetworkImage('https://picsum.photos/250?image=7'),
                    image4: NetworkImage('https://picsum.photos/250?image=8'),
                    text: Text("WhatsAppImages", style: kTextStyleBody2Regular),
                    subtext: Text(
                      "Images",
                      style: TextStyle(fontSize: 12, color: Colors.grey),
                    ),
                  ),
                  SizedBox(
                    width: 6,
                  ),
                  RecentList(
                    image1: NetworkImage('https://picsum.photos/250?image=9'),
                    image2: NetworkImage('https://picsum.photos/250?image=10'),
                    image3: NetworkImage('https://picsum.photos/250?image=11'),
                    image4: NetworkImage('https://picsum.photos/250?image=12'),
                    text: Text("WhatsApp Video", style: kTextStyleBody2Regular),
                    subtext: Text(
                      "Videos",
                      style: TextStyle(fontSize: 12, color: Colors.grey),
                    ),
                  ),
                  SizedBox(
                    width: 6,
                  ),
                  RecentList(
                    image1: NetworkImage('https://picsum.photos/250?image=13'),
                    image2: NetworkImage('https://picsum.photos/250?image=14'),
                    image3: NetworkImage('https://picsum.photos/250?image=15'),
                    image4: NetworkImage('https://picsum.photos/250?image=16'),
                    text: Text("WhatsApp", style: kTextStyleBody2Regular),
                    subtext: Text(
                      "Videos",
                      style: TextStyle(fontSize: 12, color: Colors.grey),
                    ),
                  ),
                  SizedBox(
                    width: 5,
                  ),
                  RecentList(
                    image1: NetworkImage('https://picsum.photos/250?image=9'),
                    image2: NetworkImage('https://picsum.photos/250?image=10'),
                    image3: NetworkImage('https://picsum.photos/250?image=11'),
                    image4: NetworkImage('https://picsum.photos/250?image=12'),
                    text: Text("WhatsApp Video", style: kTextStyleBody2Regular),
                    subtext: Text(
                      "Videos",
                      style: TextStyle(fontSize: 12, color: Colors.grey),
                    ),
                  ),
                  SizedBox(
                    width: 6,
                  ),
                  RecentList(
                    image1: NetworkImage('https://picsum.photos/250?image=9'),
                    image2: NetworkImage('https://picsum.photos/250?image=10'),
                    image3: NetworkImage('https://picsum.photos/250?image=11'),
                    image4: NetworkImage('https://picsum.photos/250?image=12'),
                    text: Text("WhatsApp Video", style: kTextStyleBody2Regular),
                    subtext: Text(
                      "Videos",
                      style: TextStyle(fontSize: 12, color: Colors.grey),
                    ),
                  ),
                ],
              ),
            ),
            const SizedBox(
              height: 18,
            ),
            const Text(
              "Categories",
              style: kTextStyleBody2Regular,
            ),
            const SizedBox(
              height: 12,
            ),
            Row(
              children: [
                Expanded(
                  child: Container(
                    decoration: BoxDecoration(
                      color: Colors.black26,
                      borderRadius: BorderRadius.circular(
                        15,
                      ),
                    ),
                    child: const CustomListTile(
                      leading: Icon(
                        Icons.download,
                        color: Colors.lightBlue,
                      ),
                      title: Text(
                        "Downloads",
                        style: kTextStyleBody2Regular,
                      ),
                      subtitle: Text(
                        "6.1 GB",
                        style: TextStyle(color: Colors.grey),
                      ),
                    ),
                  ),
                ),
                const SizedBox(
                  width: 8,
                  height: 8,
                ),
                Expanded(
                  child: Container(
                    decoration: BoxDecoration(
                      color: Colors.black26,
                      borderRadius: BorderRadius.circular(15),
                    ),
                    child: const CustomListTile(
                      leading: Icon(Icons.image, color: Colors.lightBlue),
                      title: Text(
                        "Images",
                        style: kTextStyleBody2Regular,
                      ),
                      subtitle: Text(
                        "3.6 GB",
                        style: TextStyle(color: Colors.grey),
                      ),
                    ),
                  ),
                ),
              ],
            ),
            const SizedBox(
              width: 8,
              height: 8,
            ),
            Row(
              children: [
                Expanded(
                  child: Container(
                    decoration: BoxDecoration(
                      color: Colors.black26,
                      borderRadius: BorderRadius.circular(
                        15,
                      ),
                    ),
                    child: const CustomListTile(
                      leading: Icon(Icons.video_file, color: Colors.lightBlue),
                      title: Text(
                        "Videos",
                        style: kTextStyleBody2Regular,
                      ),
                      subtitle: Text(
                        "5.1 GB",
                        style: TextStyle(color: Colors.grey),
                      ),
                    ),
                  ),
                ),
                const SizedBox(
                  width: 8,
                  height: 8,
                ),
                Expanded(
                  child: Container(
                    decoration: BoxDecoration(
                      color: Colors.black26,
                      borderRadius: BorderRadius.circular(15),
                    ),
                    child: const CustomListTile(
                      leading: Icon(Icons.audio_file, color: Colors.lightBlue),
                      title: Text(
                        "Audio",
                        style: kTextStyleBody2Regular,
                      ),
                      subtitle: Text(
                        "6.1 GB",
                        style: TextStyle(color: Colors.grey),
                      ),
                    ),
                  ),
                ),
              ],
            ),
            const SizedBox(
              width: 8,
              height: 8,
            ),
            Row(
              children: [
                Expanded(
                  child: Container(
                    decoration: BoxDecoration(
                      color: Colors.black26,
                      borderRadius: BorderRadius.circular(
                        15,
                      ),
                    ),
                    child: const CustomListTile(
                      leading:
                          Icon(Icons.document_scanner, color: Colors.lightBlue),
                      title: Text(
                        "Documents",
                        style: kTextStyleBody2Regular,
                      ),
                      subtitle: Text(
                        "6.1 GB",
                        style: TextStyle(color: Colors.grey),
                      ),
                    ),
                  ),
                ),
                const SizedBox(
                  width: 8,
                  height: 8,
                ),
                Expanded(
                  child: Container(
                    decoration: BoxDecoration(
                      color: Colors.black26,
                      borderRadius: BorderRadius.circular(15),
                    ),
                    child: const CustomListTile(
                      leading: Icon(Icons.apps, color: Colors.lightBlue),
                      title: Text(
                        "Apps",
                        style: kTextStyleBody2Regular,
                      ),
                      subtitle: Text(
                        "6.1 GB",
                        style: TextStyle(color: Colors.grey),
                      ),
                    ),
                  ),
                ),
              ],
            ),
            const SizedBox(
              height: 18,
            ),
            Row(
              children: [
                const Text(
                  "Collections",
                  style: kTextStyleBody2Regular,
                ),
                Spacer(),
                IconButton(
                  onPressed: () {},
                  icon: const Icon(
                    Icons.more_vert,
                    size: 20,
                  ),
                ),
              ],
            ),
            Row(
              children: [
                Expanded(
                  child: Container(
                    decoration: BoxDecoration(
                      color: Colors.black26,
                      borderRadius: BorderRadius.circular(
                        15,
                      ),
                    ),
                    child: const CustomListTile(
                      leading: Icon(Icons.star_sharp, color: Colors.lightBlue),
                      title: Text(
                        "Favourites",
                        style: kTextStyleBody2Regular,
                      ),
                    ),
                  ),
                ),
              ],
            ),
            const SizedBox(
              height: 8,
            ),
            Row(
              children: [
                Expanded(
                  child: Container(
                    decoration: BoxDecoration(
                      color: Colors.black26,
                      borderRadius: BorderRadius.circular(
                        15,
                      ),
                    ),
                    child: const CustomListTile(
                      leading: Icon(Icons.lock, color: Colors.lightBlue),
                      title: Text(
                        "Safe folder",
                        style: kTextStyleBody2Regular,
                      ),
                    ),
                  ),
                ),
              ],
            ),
            const SizedBox(
              height: 22,
            ),
            const Text(
              "Storage devices",
              style: kTextStyleBody2Regular,
            ),
            const SizedBox(
              height: 12,
            ),
            Row(
              children: [
                Expanded(
                  child: Container(
                    decoration: BoxDecoration(
                      color: Colors.black26,
                      borderRadius: BorderRadius.circular(
                        15,
                      ),
                    ),
                    child: const CustomListTile(
                      leading: Icon(
                        Icons.devices,
                        color: Colors.lightBlue,
                      ),
                      title: Text(
                        "Internal storage",
                        style: kTextStyleBody2Regular,
                      ),
                      subtitle: Text(
                        "6.1 GB",
                        style: TextStyle(color: Colors.grey),
                      ),
                    ),
                  ),
                ),
              ],
            ),
            const SizedBox(
              height: 18,
            ),
          ],
        ),
      ),
    ));
  }
}
