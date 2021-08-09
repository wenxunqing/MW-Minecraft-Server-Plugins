package org.mwage.mcPlugin.main.standard;
import java.util.HashMap;
import java.util.Map;
/**
 * 用于集中管理某一类设定的类。
 * 这些信息是暂时的，将在下一车reload后重置。
 * 
 * @author GHYNG
 * @param <O>
 *            需要被管理设定的实际目标对象。
 * @param <I>
 *            目标对象的唯一身份。
 *            这些唯一身份用于在哈希表中储存信息。
 * @param <S>
 *            储存设定的对象。
 */
public abstract class MWSettingManager<O, I, S extends MWSetting<I>> {
	private final Map<I, S> SETTINGS = new HashMap<I, S>();
}