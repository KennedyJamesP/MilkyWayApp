using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;

namespace MilkyWayApp
{
    [Activity(Label = "Map")]
    public class Map : Activity
    {
        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);
            SetContentView(Resource.Layout.Map);


            ImageButton home = FindViewById<ImageButton>(Resource.Id.home);
            ImageButton map = FindViewById<ImageButton>(Resource.Id.map);
            ImageButton camera = FindViewById<ImageButton>(Resource.Id.camera);
            ImageButton profile = FindViewById<ImageButton>(Resource.Id.profile);

            home.Click += (e, o) => {
                Toast.MakeText(this, "GOING BACK HOME NIG!", ToastLength.Short).Show();
                StartActivity(typeof(MainActivity));
            };
            // Create your application here
        }
    }
}