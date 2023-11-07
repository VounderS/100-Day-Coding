import 'package:flutter/material.dart';

class RecentList extends StatelessWidget {
  const RecentList({
    super.key,
    required this.image1,
    required this.image2,
    required this.image3,
    required this.image4,
    required this.text,
    required this.subtext,
  });

  final image1, image2, image3, image4;
  final Widget text, subtext;
  @override
  Widget build(BuildContext context) {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Row(
          children: [
            Container(
              width: 60.0,
              height: 60.0,
              decoration: BoxDecoration(
                borderRadius: BorderRadius.only(topLeft: Radius.circular(10)),
                image: DecorationImage(
                  image: image1,
                  fit: BoxFit.cover,
                ),
              ),
            ),
            SizedBox(
              width: 2,
            ),
            Container(
              width: 60.0,
              height: 60.0,
              decoration: BoxDecoration(
                borderRadius: BorderRadius.only(topRight: Radius.circular(10)),
                image: DecorationImage(
                  image: image2,
                  fit: BoxFit.cover,
                ),
              ),
            ),
          ],
        ),
        SizedBox(
          height: 2,
        ),
        Row(
          children: [
            Container(
              width: 60.0,
              height: 60.0,
              decoration: BoxDecoration(
                borderRadius:
                    BorderRadius.only(bottomLeft: Radius.circular(10)),
                image: DecorationImage(
                  image: image3,
                  fit: BoxFit.cover,
                ),
              ),
            ),
            SizedBox(
              width: 2,
            ),
            Container(
              width: 60.0,
              height: 60.0,
              decoration: BoxDecoration(
                borderRadius:
                    BorderRadius.only(bottomRight: Radius.circular(10)),
                image: DecorationImage(
                  image: image4,
                  fit: BoxFit.cover,
                ),
              ),
            ),
          ],
        ),
        SizedBox(
          height: 8,
        ),
        text,
        SizedBox(
          height: 8,
        ),
        subtext,
      ],
    );
  }
}
