package md5f46760b560d66d470f4e161d8bc11da6;


public class Map
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("MilkyWayApp.Map, MilkyWayApp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", Map.class, __md_methods);
	}


	public Map () throws java.lang.Throwable
	{
		super ();
		if (getClass () == Map.class)
			mono.android.TypeManager.Activate ("MilkyWayApp.Map, MilkyWayApp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
