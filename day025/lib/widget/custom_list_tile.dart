import 'package:flutter/material.dart';

class CustomListTile extends StatelessWidget {
  const CustomListTile(
      {super.key,
      required this.leading,
      required this.title,
      this.subtitle,
      this.onPressed});

  final Widget leading;
  final title;
  final Widget? subtitle;
  final Function()? onPressed;
  @override
  Widget build(BuildContext context) {
    return InkWell(
      splashColor: Colors.white,
      onTap: onPressed,
      child: Container(
        child: Padding(
          padding: const EdgeInsets.all(8.0),
          child: Row(
            children: [
              Padding(
                padding: EdgeInsets.only(left: 12.0),
                child: leading,
              ),
              SizedBox(
                width: 15,
              ),
              Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  title,
                  subtitle == null
                      ? Container()
                      : SizedBox(
                          height: 6,
                        ),
                  subtitle ?? Container()
                ],
              )
            ],
          ),
        ),
      ),
    );
  }
}
